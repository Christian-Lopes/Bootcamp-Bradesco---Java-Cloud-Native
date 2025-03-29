# Construindo uma Arquitetura no Azure

## O que é um Grupo de Recursos no Azure?
No Microsoft Azure, um Grupo de Recursos (Resource Group - RG) é um container lógico que agrupa e gerencia recursos relacionados (como máquinas virtuais, redes, bancos de dados, armazenamento, etc.). Ele ajuda a organizar, monitorar e aplicar regras a todos os recursos dentro do grupo.

### Benefícios do Grupo de Recursos:
- Organização → Mantém os recursos agrupados por aplicação, ambiente ou equipe.
- Gerenciamento Simplificado → Permite aplicar permissões, políticas e automação em todos os recursos do grupo.
- Facilidade na Cobrança → Ajuda a rastrear custos e otimizar o orçamento.
- Escalabilidade → Recursos podem ser gerenciados e excluídos juntos.
- Automação → Permite usar ARM Templates, Terraform ou Bicep para provisionamento automático.

### Como Criar um Grupo de Recursos no Azure Portal?
- Acesse o Azure Portal.
- No menu lateral, clique em "Grupos de Recursos".
- Clique em "Criar".
- Escolha a Assinatura correta.
- Defina um Nome para o Grupo de Recursos (ex: MeuProjeto-RG).
- Selecione a Região (exemplo: "East US", "Brazil South").
- Clique em "Revisar + Criar" e depois em "Criar".

### Quando Usar um Grupo de Recursos?
- Para organizar todos os recursos de um projeto ou aplicação.
- Para controlar permissões e acesso de forma centralizada.
- Para excluir rapidamente todos os recursos associados quando um projeto for encerrado.
- Para aplicar políticas de conformidade e segurança.

## O que é VNet no Azure?
A VNet (Virtual Network) no Microsoft Azure é um serviço que permite criar redes privadas dentro do ambiente da nuvem. Ele funciona de forma semelhante a uma rede tradicional on-premise, permitindo que recursos do Azure, como Máquinas Virtuais (VMs), Bancos de Dados e Serviços de Aplicação, se comuniquem entre si de forma segura.

### Principais Características da VNet:
- Isolamento de Rede: Cada VNet é isolada das outras, garantindo segurança.
- Sub-redes: Dentro de uma VNet, você pode dividir a rede em subnets para organizar e controlar o tráfego.
- Conectividade Híbrida: Permite conectar sua infraestrutura local ao Azure via VPN Gateway ou ExpressRoute.
- Controle de Tráfego: Usa NSGs (Network Security Groups) para definir regras de firewall e controle de acesso.
- Integração com Serviços do Azure: Permite que VMs, Kubernetes (AKS) e bancos de dados se comuniquem dentro da rede privada.

### Como Criar uma VNet no Azure Portal?
- Acesse o Azure Portal (portal.azure.com).
- Pesquise por "Virtual Network" e clique em "Criar".
- Escolha um Grupo de Recursos e defina um Nome para a VNet.
- Configure o Endereçamento CIDR (exemplo: 10.0.0.0/16).
- Crie sub-redes (exemplo: uma para VMs e outra para bancos de dados).
- Revise e clique em "Criar" para finalizar a configuração.

### Quando Usar uma VNet?
- Para conectar máquinas virtuais (VMs) em uma rede privada.
- Para criar redes seguras e isoladas dentro do Azure.
- Para conectar sua infraestrutura local ao Azure via VPN ou ExpressRoute.
- Para aplicar firewalls e regras de segurança com NSGs.
- Para conectar bancos de dados e serviços internos sem exposição pública.
