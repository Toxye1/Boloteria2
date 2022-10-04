
    create table cliente (
       id integer not null auto_increment,
        endereco tinyblob not null,
        nome varchar(20) not null,
        pedido tinyblob not null,
        primary key (id)
    ) engine=MyISAM

    create table endereco (
       id integer not null auto_increment,
        bairro varchar(255),
        cep varchar(255),
        cidade varchar(255),
        complemento varchar(255),
        estado varchar(255),
        logradouro varchar(255),
        numero varchar(255),
        primary key (id)
    ) engine=MyISAM

    create table pagamento (
       id integer not null auto_increment,
        dinheiro bit not null,
        primary key (id)
    ) engine=MyISAM

    create table pedido (
       id integer not null auto_increment,
        pagamento tinyblob not null,
        produto_id integer not null,
        primary key (id)
    ) engine=MyISAM

    create table produto (
       id integer not null auto_increment,
        informacao_nutricional varchar(255) not null,
        ingredientes varchar(255) not null,
        nome varchar(20) not null,
        preco double precision not null,
        primary key (id)
    ) engine=MyISAM

    alter table pedido 
       add constraint FK73bw249kqpeedj11lmig00nj4 
       foreign key (produto_id) 
       references produto (id)

    create table cliente (
       id integer not null auto_increment,
        endereco tinyblob not null,
        nome varchar(20) not null,
        pedido tinyblob not null,
        primary key (id)
    ) engine=MyISAM

    create table endereco (
       id integer not null auto_increment,
        bairro varchar(255),
        cep varchar(255),
        cidade varchar(255),
        complemento varchar(255),
        estado varchar(255),
        logradouro varchar(255),
        numero varchar(255),
        primary key (id)
    ) engine=MyISAM

    create table pagamento (
       id integer not null auto_increment,
        dinheiro bit not null,
        primary key (id)
    ) engine=MyISAM

    create table pedido (
       id integer not null auto_increment,
        pagamento tinyblob not null,
        produto_id integer not null,
        primary key (id)
    ) engine=MyISAM

    create table produto (
       id integer not null auto_increment,
        informacao_nutricional varchar(255) not null,
        ingredientes varchar(255) not null,
        nome varchar(20) not null,
        preco double precision not null,
        primary key (id)
    ) engine=MyISAM

    alter table pedido 
       add constraint FK73bw249kqpeedj11lmig00nj4 
       foreign key (produto_id) 
       references produto (id)
