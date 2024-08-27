package designPattern.proxy.solucao;

import designPattern.builder.Pessoa;

public interface ProxyPessoa {
    void save(Pessoa pessoa);

    Pessoa findById(Long id);
}
