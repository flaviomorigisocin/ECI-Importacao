package br.com.fmorigi.ECIImportacao.service;

import org.springframework.stereotype.Service;

@Service
public class ConsumerServiceImpl implements ConsumerService {
    @Override
    public void action(String mensagem) {
        if (mensagem.length() > 100) {
            mensagem = mensagem.substring(0, 100) + "...";
        }
        System.out.println("Msg Recebida: " + mensagem );
    }
}
