CREATE TABLE pagos_online(
    id, BINARY(16) UNIQUE not null,
    id_cuenta_origen BINARY(16) not null,
    id_cuenta_destino BINARY(16) not null,
    monto decimal(19,4) not null,
    fecha_transferencia datetime not null
)

CREATE TABLE cuenta(
    id, BINARY(16) not null,
    user_id varchar(50) not null,
    saldo_cuenta decimal(19,4) not null,
    activa bit not null
)

create table persona(
    id, BINARY(16) not null,
    name varchar(50) not null,
    lastname varchar(50) not null,
    id_persona bigint not null,
    activa bit not null
)

create table empresa(
    id, BINARY(16) not null,
    name varchar(50) not null,
    id_empresa bigint not null,
    activa bit not null
)