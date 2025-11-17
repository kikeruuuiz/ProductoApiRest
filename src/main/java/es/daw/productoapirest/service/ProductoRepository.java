package es.daw.productoapirest.service;

import es.daw.productoapirest.entity.Producto;
import org.springframework.data.repository.Repository;

interface ProductoRepository extends Repository<Producto, Integer> {
}
