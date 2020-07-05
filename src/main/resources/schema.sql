create table INVENTORY
(
    SKU   LONG auto_increment
        constraint INVENTORY_PK
            unique,
    NAME  VARCHAR(100) not null,
    COUNT INT default 0
);