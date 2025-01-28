package org.mauxis.mcenter.controller;

import org.apache.coyote.Response;
import org.mauxis.mcenter.helper.CategoryHelper;
import org.mauxis.mcenter.vo.CategoryCreateRequestVO;
import org.mauxis.mcenter.vo.GeneralResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMessage;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CategoryController {

    @Autowired
    CategoryHelper categoryHelper;

    @RequestMapping(value="/category/create", method= RequestMethod.POST)
    public ResponseEntity<GeneralResponse> create (@RequestBody CategoryCreateRequestVO request){
        try{
            categoryHelper.create(request);
            return new ResponseEntity<>(new GeneralResponse(HttpStatus.OK.value(), "OK"), HttpStatus.OK);
        }catch(Exception e){
            return new ResponseEntity<>(new GeneralResponse(HttpStatus.I_AM_A_TEAPOT.value(), HttpStatus.I_AM_A_TEAPOT.getReasonPhrase()), HttpStatus.I_AM_A_TEAPOT);
        }
    }

    @RequestMapping(value="/category/replace", method= RequestMethod.PUT)
    public ResponseEntity<GeneralResponse> replace (@RequestBody CategoryCreateRequestVO request){
        try{
            categoryHelper.create(request);
            return new ResponseEntity<>(new GeneralResponse(HttpStatus.OK.value(), "OK"), HttpStatus.OK);
        }catch(Exception e){
            return new ResponseEntity<>(new GeneralResponse(HttpStatus.I_AM_A_TEAPOT.value(), HttpStatus.I_AM_A_TEAPOT.getReasonPhrase()), HttpStatus.I_AM_A_TEAPOT);
        }
    }

    @RequestMapping(value="/category/update", method= RequestMethod.PATCH)
    public ResponseEntity<GeneralResponse> update (@RequestBody CategoryCreateRequestVO request){
        try{
            categoryHelper.create(request);
            return new ResponseEntity<>(new GeneralResponse(HttpStatus.OK.value(), "OK"), HttpStatus.OK);
        }catch(Exception e){
            return new ResponseEntity<>(new GeneralResponse(HttpStatus.I_AM_A_TEAPOT.value(), HttpStatus.I_AM_A_TEAPOT.getReasonPhrase()), HttpStatus.I_AM_A_TEAPOT);
        }
    }

    @RequestMapping(value="/category/delete", method= RequestMethod.DELETE)
    public ResponseEntity<GeneralResponse> delete (@RequestBody CategoryCreateRequestVO request){
        try{
            categoryHelper.create(request);
            return new ResponseEntity<>(new GeneralResponse(HttpStatus.OK.value(), "OK"), HttpStatus.OK);
        }catch(Exception e){
            return new ResponseEntity<>(new GeneralResponse(HttpStatus.I_AM_A_TEAPOT.value(), HttpStatus.I_AM_A_TEAPOT.getReasonPhrase()), HttpStatus.I_AM_A_TEAPOT);
        }
    }

    @RequestMapping(value="/category/find", method= RequestMethod.GET)
    public ResponseEntity<GeneralResponse> findCategory (@RequestBody CategoryCreateRequestVO request){
        try{
            categoryHelper.create(request);
            return new ResponseEntity<>(new GeneralResponse(HttpStatus.OK.value(), "OK"), HttpStatus.OK);
        }catch(Exception e){
            return new ResponseEntity<>(new GeneralResponse(HttpStatus.I_AM_A_TEAPOT.value(), HttpStatus.I_AM_A_TEAPOT.getReasonPhrase()), HttpStatus.I_AM_A_TEAPOT);
        }
    }

    @RequestMapping(value="/category/findAll", method= RequestMethod.GET)
    public ResponseEntity<GeneralResponse> findAllCategory (@RequestBody CategoryCreateRequestVO request){
        try{
            categoryHelper.create(request);
            return new ResponseEntity<>(new GeneralResponse(HttpStatus.OK.value(), "OK"), HttpStatus.OK);
        }catch(Exception e){
            return new ResponseEntity<>(new GeneralResponse(HttpStatus.I_AM_A_TEAPOT.value(), HttpStatus.I_AM_A_TEAPOT.getReasonPhrase()), HttpStatus.I_AM_A_TEAPOT);
        }
    }

}
