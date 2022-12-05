package br.com.fmorigi.ECIImportacao.service;

import org.springframework.stereotype.Service;

@Service
public class ConsumerServiceImpl implements ConsumerService {
    @Override
    public void action(String mensagem) {
        System.out.println("Mensagem Recebida: " +mensagem);
    }
}
