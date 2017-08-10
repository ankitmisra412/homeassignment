jQuery.ajax({
    url: "http://www.thomas-bayer.com/sqlrest/CUSTOMER",
    type: "GET",
    
    contentType: 'application/json'; charset=utf-8,
    success: function(resultData){
        console.log('success', resultData);
    },
    error: function(jqXHR, textStatus, errorthrown){

    },

    timeout: 120000
});