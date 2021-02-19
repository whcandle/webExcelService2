package com.mg.webexcel.controller;


import com.mg.webexcel.util.R;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@Api(tags = "/webExcel/设计器")
@RestController
@RequestMapping("/webExcel/Designer")
@RequiredArgsConstructor
public class ExcelDesigner {
    @ApiOperation(value = "test")
    @GetMapping("/test")
    public R test() {

        return R.ok("test");
    }




}
