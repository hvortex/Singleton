UC: Modelos, métodos e técnicas da engenharia de software

PRÁTICA - FÁBRICA DE CHOCOLATE

As modernas fábricas de chocolate utilizam sistemas automatizados para controlar suas caldeiras, que são responsáveis por misturar leite e chocolate, aquecê-los até a ebulição e passar a mistura para a fase seguinte da produção de barras de chocolate.

A tarefa é implementar um sistema que controle a caldeira de chocolate da fábrica XYZ, obedecendo às seguintes regras operacionais:

Regras do Sistema:

Preenchimento da Caldeira: A caldeira só pode ser preenchida com chocolate e leite quando estiver vazia.
Fervura: A caldeira só pode ferver a mistura se ela já estiver cheia, mas ainda não fervida.
Drenagem: A caldeira só pode ser drenada após a mistura ter sido fervida. Não é possível drenar a caldeira se o conteúdo ainda não foi fervido ou se ela estiver vazia.

Requisitos:

Padrão Singleton: Para garantir que apenas uma caldeira esteja em operação ao mesmo tempo, você deve usar o padrão Singleton. Isso significa que o sistema deve permitir a criação de apenas uma instância da caldeira durante todo o processo de fabricação.
Estados da Caldeira: A caldeira deve ter três estados distintos:
Vazia: A caldeira está vazia e pronta para ser preenchida.
Cheia: A caldeira foi preenchida com chocolate e leite, mas a mistura ainda não foi fervida.
Em ebulição: A caldeira está fervendo a mistura de chocolate e leite

Comportamento do Sistema:

Preenchimento: Se a caldeira estiver vazia, o sistema deve permitir que ela seja preenchida. Caso contrário, o preenchimento não deve ser permitido.
Fervura: O sistema só deve permitir que a caldeira ferva quando estiver cheia. Se a caldeira estiver vazia ou se a mistura já estiver fervida, a operação não deve ser permitida.
Drenagem: A mistura deve ser drenada apenas se tiver passado pelo processo de fervura. Se o conteúdo ainda não estiver fervido ou a caldeira estiver vazia, a drenagem não deve ocorrer.


--UNA Contagem--