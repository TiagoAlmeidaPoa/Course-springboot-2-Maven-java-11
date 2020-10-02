package com.educandoweb.courseJPAMaven.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.educandoweb.courseJPAMaven.entities.OrderItem;

// essa anotacao é opcional neste caso pois a interface esta herdando de JPARepository 
// que já esta registrada como um componente do spring
@Repository
public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{

}
