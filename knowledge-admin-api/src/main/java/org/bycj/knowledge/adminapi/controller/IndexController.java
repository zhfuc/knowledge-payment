package org.bycj.knowledge.adminapi.controller;

import org.bycj.knowledge.core.util.ResponseUtil;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {

    @GetMapping("/admin/index")
    public ResponseUtil Index() {
        return ResponseUtil.getSuccess().put("msg", "oooo");
    }
}
