# Configurando Recursos e Dimensionamentos em Máquinas Virtuais na Azure
Na aula, criamos uma VMs e configuramos. Também passamos na área de trabalho e aplicativos de funções do Azure.
## Benefícios das VMs no Azure
- Escalabilidade → Aumente ou reduza os recursos conforme necessário.
- Flexibilidade → Rode Windows, Linux, Banco de Dados, Aplicações Web e muito mais.
- Paga pelo uso → Cobrança baseada no tempo de execução e recursos consumidos.
- Backup e Recuperação → Recursos integrados de snapshots e alta disponibilidade.
- Integração com outros serviços do Azure → Como bancos de dados, redes virtuais (VNet) e segurança (NSG, Firewall, Defender for Cloud).

### Como Criar uma VM no Azure (Passo a Passo)
- Acesse o Azure Portal
- No menu lateral, clique em "Máquinas Virtuais"
- Clique em "Criar" → "Máquina Virtual do Azure"
#### Escolha:

- Grupo de Recursos (ou crie um novo)
- Nome da VM
- Região (ex: Brazil South)
- Imagem (Sistema Operacional) → Windows ou Linux
- Tamanho da VM → Exemplo: Standard_B2s (2 vCPUs, 4GB RAM)
- Configure a Autenticação → Usuário/Senha ou Chave SSH (Linux)
- Defina regras de Rede e Segurança (NSG)
- Clique em "Revisar + Criar" e depois "Criar" 🚀

### Quando Usar uma VM no Azure?
- Para rodar aplicações e servidores na nuvem.
- Para hospedar bancos de dados, APIs e microsserviços.
- Para criar ambientes de teste e desenvolvimento.
- Para processar cargas de trabalho intensivas (IA, Big Data, Machine Learning).

## O que é a Área de Trabalho Virtual do Azure (Azure Virtual Desktop - AVD).
O Azure Virtual Desktop (AVD) é um serviço de virtualização de desktops e aplicativos baseado na nuvem da Microsoft. Ele permite que empresas e usuários acessem um desktop remoto seguro e escalável de qualquer lugar, sem precisar de hardware físico avançado.

### Benefícios do Azure Virtual Desktop
- Acesso Remoto Seguro → Conecte-se ao seu ambiente de trabalho de qualquer dispositivo.
- Redução de Custos → Substitui infraestrutura física com um modelo baseado em nuvem.
- Escalabilidade Flexível → Adicione ou remova usuários conforme necessário.
- Integração com Microsoft 365 → Use Word, Excel, Teams e outros aplicativos de forma otimizada.
- Segurança Avançada → Proteção com autenticação multifator (MFA), Azure AD e políticas de segurança.
- Experiência Multiusuário → Diferente de uma VM tradicional, permite que vários usuários compartilhem a mesma sessão de Windows 10/11.

### Como Configurar um Azure Virtual Desktop (AVD)?
- Acesse o Azure Portal
- Pesquise por "Azure Virtual Desktop" e clique em "Criar um host pool"
#### Escolha:

- Nome do Host Pool
- Região (Ex: Brazil South)
- Tipo de Pool → Pessoal (1 usuário por VM) ou - Compartilhado (multiusuário)
- Configure a Máquina Virtual (VM) que hospedará o desktop virtual
- Configure a Rede (VNet e segurança)
- Associe usuários e grupos do Azure AD
- Clique em "Criar" e aguarde a implantação
- Acesse a área de trabalho virtual via Microsoft Remote Desktop
### Como Acessar o Azure Virtual Desktop?
- Via Navegador: https://rdweb.wvd.microsoft.com/arm/webclient
- Via Aplicativo Remote Desktop: Disponível para Windows, macOS, iOS e Android

### Quando Usar o Azure Virtual Desktop?
- Para permitir que funcionários remotos acessem um ambiente corporativo seguro
- Para reduzir custos de hardware e manutenção de PCs
- Para oferecer ambientes virtuais compartilhados para colaboradores
- Para fornecer acesso seguro e escalável a aplicativos empresariais

## O que é o Aplicativo de Funções do Azure (Azure Functions)?
O Azure Functions é um serviço de computação serverless que permite executar código sem precisar gerenciar infraestrutura de servidores. Ele é ideal para tarefas automatizadas, integração entre sistemas e execução de código sob demanda.

### Principais Benefícios do Azure Functions
- Sem necessidade de gerenciar servidores → O Azure aloca recursos automaticamente.
- Paga apenas pelo uso → Cobrança baseada no tempo de execução do código.
- Alta escalabilidade → Aumenta ou reduz automaticamente conforme a demanda.
- Suporte a várias linguagens → C#, Python, JavaScript, Java, PowerShell, TypeScript, Go, Rust e mais.
- Gatilhos e Eventos → Pode ser ativado por eventos do Azure Storage, Cosmos DB, Service Bus, HTTP Requests e mais.
- Integração com outros serviços do Azure → Como Logic Apps, Event Grid, Kubernetes e Power Automate.

### Como Criar um Aplicativo de Funções no Azure?
- Acesse o Azure Portal
- Pesquise por "Function App" e clique em Criar
- Escolha um Grupo de Recursos ou crie um novo
- Defina o Nome do Aplicativo de Funções
- Escolha o Runtime Stack (Ex: Python, .NET, Node.js, Java)
- Selecione um Plano de Hospedagem

Plano de Consumo (serverless, escala automaticamente)
Plano Premium (mais controle e desempenho)
- Configure Armazenamento e Rede
- Clique em "Criar"

### Exemplos de Uso do Azure Functions
- Processamento de Dados Automático → Como renomear arquivos ao serem enviados para o Azure Blob Storage.
- Integração com APIs e Webhooks → Criar funções que respondem a requisições HTTP.
- Automação de Tarefas → Como desligar VMs automaticamente em horários específicos.
- Análise de Eventos em Tempo Real → Processar mensagens do Azure Service Bus.

### Quando Usar o Azure Functions?
- Para rodar pequenos blocos de código sem infraestrutura fixa
- Para responder a eventos e gatilhos
- Para processar dados e automatizar fluxos de trabalho
- Para criar APIs leves e escaláveis























