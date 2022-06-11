CREATE TABLE IF NOT EXISTS jugador(
    id SERIAL,
    nombre VARCHAR (100) NOT NULL,
    hora VARCHAR (100) NOT NULL,
    cancha VARCHAR (100) NOT NULL,
    PRIMARY KEY (id)

    );