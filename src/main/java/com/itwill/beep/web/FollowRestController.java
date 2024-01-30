package com.itwill.beep.web;

import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.itwill.beep.domain.Account;
import com.itwill.beep.service.FollowService;
import com.itwill.beep.service.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RequiredArgsConstructor
@RestController
@RequestMapping("/api/follow/")
public class FollowRestController {
    private final FollowService followService;
    private final UserService userService;

    @PostMapping("add/{toUserId}")
    public ResponseEntity<Boolean> follow(Authentication authentication,
            @PathVariable("toUserId") Long toUserId) {
        Account fromUser = userService.loginUser(authentication.getName());
        Account toUser = userService.findByUserId(toUserId);
        followService.follow(fromUser, toUser);
        log.info("{} 님이 {} 님을 팔로우합니다.", fromUser.getUsername(), toUser.getUsername());
        return ResponseEntity.ok(true);
    }

    @DeleteMapping("delete/{name}")
    public ResponseEntity<Boolean> unfollow(Authentication authentication) {
        Account loggedInUser = userService.loginUser(authentication.getName());
        followService.unfollow(loggedInUser);
        log.info("{} 님이 언팔로우합니다.", loggedInUser.getUsername());

        return ResponseEntity.ok(true);
    }
}
