package com.steve.fullstackresturant.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.steve.fullstackresturant.models.MenuItem;

@Repository
public interface MenuItemRepository extends CrudRepository<MenuItem,Long>{
}
