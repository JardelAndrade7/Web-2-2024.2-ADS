CREATE TABLE model_partida(
    id bigint not null auto_increment,
    local_realizacao varchar(50),
    data_realizacao date,
    time_begin time,
    time_end time,
    PRIMARY KEY(id)
);