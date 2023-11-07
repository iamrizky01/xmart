package com.example.xmartjava.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.xmartjava.entity.Transaksi;

public interface TransaksiRepository extends JpaRepository<Transaksi, String> {

}
