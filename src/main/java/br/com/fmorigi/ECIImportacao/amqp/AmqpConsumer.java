package br.com.fmorigi.ECIImportacao.amqp;

public interface AmqpConsumer<T> {
    void consumer(T t);
}
