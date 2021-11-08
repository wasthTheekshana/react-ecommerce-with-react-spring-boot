const   BASE_URL = "";
export function httpPost(url,param) {
    const requestOption = {
      method: 'POST',
      header: { 'Content-Type': 'application/json' },
      body: JSON.stringify(param)
    };
    return fetch(BASE_URL+url,requestOption)
}

export function httpPostwithToken(url,param){
    param['userId'] = localStorage.getItem("user_id");
    const requestOptions =  {
         method: 'POST',
        header: {
             'Content-Type': 'application/json',
            "Authorization" : "Bearer "+localStorage.getItem("token")
         },
        body: JSON.stringify(param)
    };
    return fetch(BASE_URL+url,requestOptions)
}