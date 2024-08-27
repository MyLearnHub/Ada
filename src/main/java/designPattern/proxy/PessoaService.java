package designPattern.proxy;

import designPattern.builder.Pessoa;
import designPattern.proxy.solucao.ProxyPessoa;

public class PessoaService {
    private ProxyPessoa proxyPessoa;

    public PessoaService(ProxyPessoa proxyPessoa) {
        this.proxyPessoa = proxyPessoa;
    }

    public void save(Pessoa pessoa) {
        proxyPessoa.save(pessoa);
    }

    public Pessoa findById(Long id) {
        return proxyPessoa.findById(id);
    }
}
