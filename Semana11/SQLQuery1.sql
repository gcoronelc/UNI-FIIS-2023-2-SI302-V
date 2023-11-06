

SELECT * FROM EUREKABANK..CLIENTE;
GO

select chr_cliecodigo codigo,
vch_cliepaterno paterno, vch_cliematerno materno,
vch_clienombre nombre, chr_cliedni dni,
vch_cliedireccion direccion, vch_clietelefono telegono
from cliente;
go

select * from cuenta;
go

select count(1) filas from asignado
where chr_emplcodigo='00059' and dtt_asigfechabaja is null;
go

select chr_sucucodigo sucursal from asignado
where chr_emplcodigo='0005' and dtt_asigfechabaja is null;
go

select * from sucursal;
go

update sucursal 
set int_sucucontcuenta = int_sucucontcuenta + 1
where chr_sucucodigo = ?
go

select int_sucucontcuenta cont 
from sucursal 
where chr_sucucodigo = ?
go


select * from cuenta;
go

insert into cuenta(chr_cuencodigo,chr_monecodigo,
chr_sucucodigo,chr_emplcreacuenta,chr_cliecodigo,
dec_cuensaldo,dtt_cuenfechacreacion,vch_cuenestado,
int_cuencontmov,chr_cuenclave)
values(?,?,?,?,?,?,getdate(),'ACTIVO',1,,?)
go

select * from TipoMovimiento
go

select * from movimiento;
go

insert into movimiento(chr_cuencodigo,int_movinumero,
dtt_movifecha,chr_emplcodigo,chr_tipocodigo,dec_moviimporte)
values(?,1,getdate(),?,'001',?)
go

select * from cuenta where chr_sucucodigo='004';
go

select * from Movimiento
where chr_cuencodigo like '004%'
go



