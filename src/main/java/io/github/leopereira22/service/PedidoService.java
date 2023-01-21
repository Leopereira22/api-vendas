package io.github.leopereira22.service;

import io.github.leopereira22.domain.entity.Pedido;
import io.github.leopereira22.enums.StatusPedido;
import io.github.leopereira22.domain.dto.PedidoDTO;

import java.util.Optional;

public interface PedidoService {
    Pedido salvar( PedidoDTO dto );
    Optional<Pedido> obterPedidoCompleto(Integer id);
    void atualizaStatus(Integer id, StatusPedido statusPedido);
}
