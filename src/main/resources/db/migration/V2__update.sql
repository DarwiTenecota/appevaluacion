CREATE VIEW horaview AS
    SELECT hora, COUNT(hora) AS frequency FROM jugador GROUP BY (hora);

CREATE VIEW canchaview AS
        SELECT cancha, COUNT(cancha) AS frequency FROM jugador GROUP BY (cancha);
