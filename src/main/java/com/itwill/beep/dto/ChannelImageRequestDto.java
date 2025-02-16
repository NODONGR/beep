package com.itwill.beep.dto;

import org.springframework.web.multipart.MultipartFile;
import com.itwill.beep.domain.ChannelEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
public class ChannelImageRequestDto {

    private Long channelId; // 추가: 채널 ID
    private MultipartFile imgFile;
    private String channelProfileImg;

    public ChannelEntity toEntity(String channelProfileImg) {
        return ChannelEntity.builder().channelId(channelId) // 추가: 채널 ID 설정
                .channelProfileImg(channelProfileImg).build();
    }
}
