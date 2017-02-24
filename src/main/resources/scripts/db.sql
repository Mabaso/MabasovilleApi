CREATE TABLE areas(
id INTEGER PRIMARY KEY,
description VARCHAR(100),
effective_from TIMESTAMP  NOT NULL,
effective_to TIMESTAMP NOT NULL,
img_url VARCHAR(200)
);

CREATE TABLE ranks(
id INTEGER PRIMARY KEY,
description VARCHAR(100),
area_id  INTEGER,
first VARCHAR(7),
last VARCHAR(7),
latitude DECIMAL(13,13),
longitude DECIMAL(13,13),
coordinate VARCHAR(100),
effective_from TIMESTAMP NOT NULL,
effective_to TIMESTAMP NOT NULL,

CONSTRAINT fk_area_id1
    FOREIGN KEY (area_id)
    REFERENCES areas(id)
);

CREATE TABLE prices(
id INTEGER PRIMARY KEY,
rank_id INTEGER,
price DECIMAL(4,2) NOT NULL,
area_from INTEGER,
area_to INTEGER,
effective_from TIMESTAMP NOT NULL,
effective_to TIMESTAMP NOT NULL,

CONSTRAINT fk_rank_id
    FOREIGN KEY (rank_id)
    REFERENCES ranks(id),

CONSTRAINT fk_area_from
    FOREIGN KEY (area_from)
    REFERENCES areas(id),

CONSTRAINT fk_area_to
    FOREIGN KEY (area_to)
    REFERENCES areas(id)
);