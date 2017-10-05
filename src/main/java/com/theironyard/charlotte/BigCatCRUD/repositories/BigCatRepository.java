package com.theironyard.charlotte.BigCatCRUD.repositories;

import com.theironyard.charlotte.BigCatCRUD.models.BigCat;
import org.springframework.data.repository.CrudRepository;

public interface BigCatRepository extends CrudRepository <BigCat, Integer>{
}
