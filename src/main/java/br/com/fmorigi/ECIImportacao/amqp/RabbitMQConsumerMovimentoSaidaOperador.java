package br.com.fmorigi.ECIImportacao.amqp;

import br.com.fmorigi.ECIImportacao.service.ConsumerService;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class RabbitMQConsumerMovimentoSaidaOperador implements AmqpConsumer<String> {

    @Autowired
    private ConsumerService consumerService;

    @Override
    @RabbitListener(queues = "${fila.movimento_saida_operador}", autoStartup = "${fila.movimento_saida_operador_start}")
    public void consumer(String mensagem) {
        consumerService.action(mensagem);
    }

}
