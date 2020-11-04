package kr.springcoreproject.springapplicationcontext;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


@RunWith(SpringRunner.class)
// WebMvcTest slicing test
// 계층형 테스트 Web과 관련된 bean만 등록해준다
// 주로 Controller만 등록해준다 WebMvcTest에 Convertor나 Formatter를 등록
//@WebMvcTest({EventFormatter.class,EventController.class})
@WebMvcTest({EventConverter.StringToEventConverter.class,EventController.class})
public class EventControllerTest {
    @Autowired
    MockMvc mockMvc;

    @Test
    public void getTest() throws Exception {
                //get 요청 1을 보낸다
                //status가 200으로 나오길 바란다
                //content가 1이 나오길 바란다.
        mockMvc.perform(get("/event/1"))
                .andExpect(status().isOk())
                .andExpect(content().string("1"));

    }
}