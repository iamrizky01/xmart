package com.example.xmartjava.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.xmartjava.entity.Barang;

public interface BarangRepository extends JpaRepository<Barang, String> {

}
