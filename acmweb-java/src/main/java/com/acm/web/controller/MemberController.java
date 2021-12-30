package com.acm.web.controller;


import com.acm.web.entity.Member;
import com.acm.web.enums.ResponseEnum;
import com.acm.web.form.QueryMembers;
import com.acm.web.service.MemberService;
import com.acm.web.vo.ResponseVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping
public class MemberController {

    @Autowired
    MemberService memberService;

    @GetMapping("/getYear")
    public ResponseVo<List<String>> getYear(){
        return memberService.getYear();
    }

    @GetMapping("/getCollege")
    public ResponseVo<List<String>> getCollege(){
        return memberService.getCollege();
    }

    @PostMapping("/members")
    public ResponseVo<List<Member>> members(@RequestBody QueryMembers queryMembers) {
        return memberService.members(queryMembers);
    }

    @PostMapping("/addMember")
    public ResponseVo addMember(@RequestBody Member member) {
        return memberService.addMember(member);
    }

    @PostMapping("/updateMember")
    public ResponseVo updateMember(@RequestBody Member member) {
        return memberService.updateMember(member);

    }

    @PostMapping("/delMember")
    public ResponseVo delMember(@RequestBody Member member) {
        boolean ans = memberService.removeById(member.getId());
        if (ans) return ResponseVo.success("删除成功");
        else return ResponseVo.error(ResponseEnum.ERROR);
    }
}
