package com.web.servlet;

import com.alibaba.fastjson.JSON;
import com.pojo.Carbon;
import com.service.CarbonService;
import com.service.impl.CarbonServiceImpl;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CarbonServlet extends BaseServlet{
    private final CarbonService carbonService = new CarbonServiceImpl();

    public void selectAll(HttpServletRequest request, HttpServletResponse response) {
        List<Carbon> carbons = carbonService.selectAll();
        String jsonString = JSON.toJSONString(carbons);
        response.setContentType("text/json;charset=utf-8");
        try {
            response.getWriter().write(jsonString);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void selectOne(HttpServletRequest request, HttpServletResponse response) {
        String id = request.getParameter("id");
        Carbon carbon = carbonService.selectOne(id);
        List<Carbon> carbonList = new ArrayList<>();
        carbonList.add(carbon);
        response.setContentType("text/json;charset=utf-8");
        String jsonString = JSON.toJSONString(carbonList);
        try {
            response.getWriter().write(jsonString);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void add(HttpServletRequest request, HttpServletResponse response) {
        String addId = request.getParameter("addId");
        carbonService.add(addId);
    }
    public void update(HttpServletRequest request, HttpServletResponse response) throws IOException {
        BufferedReader br = request.getReader();
        String params = br.readLine();
        Carbon carbon = JSON.parseObject(params,Carbon.class);
        carbonService.update(carbon);
    }
}
