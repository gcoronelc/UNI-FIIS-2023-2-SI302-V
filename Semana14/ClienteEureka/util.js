function fnLlenarCombo(combo, lista){
    combo.empty();
    for (var i = 0; i < lista.length; i++) {
        var item = "<option value='" + lista[i].code + "'>" + lista[i].value + "</option>";
        combo.append(item);
      }
}