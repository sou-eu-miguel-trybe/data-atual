package com.trybe.dataatual.service;

import com.trybe.dataatual.model.Data;
import java.time.LocalDateTime;
import java.time.ZoneId;
import org.springframework.stereotype.Service;

@Service
public class DataService {
  public Data retornaDataAtual() {
    return new Data(LocalDateTime.now(ZoneId.of("UTC")));
  }
}
