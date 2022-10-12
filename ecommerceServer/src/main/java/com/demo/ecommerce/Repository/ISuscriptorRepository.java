package com.demo.ecommerce.Repository;


import com.demo.ecommerce.Model.Suscriptor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ISuscriptorRepository extends JpaRepository<Suscriptor, String> {
}
