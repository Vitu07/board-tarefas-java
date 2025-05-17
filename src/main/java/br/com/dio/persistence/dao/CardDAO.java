package br.com.dio.persistence.dao;

import br.com.dio.dto.CardDetails;
import lombok.AllArgsConstructor;

import java.sql.Connection;
import java.sql.SQLException;

@AllArgsConstructor
public class CardDAO {

    private final Connection connection;

    public CardDetails findById(final Long Id) throws SQLException{
        return null;
    }
}
