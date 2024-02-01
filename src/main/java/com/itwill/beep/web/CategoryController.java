package com.itwill.beep.web;

import java.util.List;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import com.itwill.beep.domain.Account;
import com.itwill.beep.domain.Category;
import com.itwill.beep.service.CategoryService;
import com.itwill.beep.service.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
@RequiredArgsConstructor
@RequestMapping("/categories")
public class CategoryController {

    private final CategoryService categoryService;
    private final UserService userService;

    @GetMapping
    public String showCategories(Model model) {
        log.info("showCategories()");
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();

        Account user = userService.loginUser(authentication.getName());

        model.addAttribute("categories", categoryService.findAllAndSaveCategories());
        model.addAttribute("mostViewers", categoryService.findByTotalViewers());
        model.addAttribute("user", user);

        return "categories";
    }

    @ResponseBody
    @GetMapping("/api/search")
    public ResponseEntity<List<Category>> searchGamesApi(
            @RequestParam(value = "keyword") String keyword) {
        log.info("searchGamesApi(keyword={})", keyword);
        List<Category> foundGames = categoryService.searchGames(keyword);

        // ResponseEntity를 사용하여 HTTP 응답을 반환
        return ResponseEntity.ok(foundGames);

    }

}
