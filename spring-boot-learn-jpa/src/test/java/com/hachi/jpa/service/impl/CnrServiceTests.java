package com.hachi.jpa.service.impl;

import com.hachi.jpa.entity.Cnr;
import com.hachi.jpa.service.CnrService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class CnrServiceTests {

    @Autowired
    CnrService cnrService;

    @Test
    void findAllCnr() {
        List<Cnr> cnrs = cnrService.findAllCnr();
        assertThat(cnrs).isNotEmpty();
    }
}