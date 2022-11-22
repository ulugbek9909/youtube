package com.company.service;

import com.company.repository.BaseRepository;
import org.modelmapper.ModelMapper;

/**
 * Author : Khonimov Ulugbek
 * Date : 08.11.2022
 * Time : 10:04 AM
 */

abstract public class AbstractService<R extends BaseRepository> {
    protected R repository;

    protected ModelMapper modelMapper;

    public AbstractService(R repository) {
        this.repository = repository;
    }

}
