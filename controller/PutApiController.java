package com.example.put.controller;

import com.example.put.dto.PutRequestDto;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class PutApiController {

    @PutMapping("/put/{user-id}")
    public PutRequestDto put(@RequestBody PutRequestDto requestDto, @PathVariable(name="user-id") Long userId) {
        System.out.println(requestDto);
        System.out.println(userId);
        return requestDto;   // response 내려주기
        // spring boot에서는 객체를 return하면 설정한 Json naming에 따라
        // 알아서 Json의 형태로 변환해서 응답 내려줌.
    }
}
