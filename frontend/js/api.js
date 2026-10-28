// After deploying the API, replace this with your backend URL.
const API_BASE_URL = window.API_BASE_URL || "http://localhost:8080/api";
async function apiRequest(path, options={}) {
 const res = await fetch(`${API_BASE_URL}${path}`, {...options,headers:{"Content-Type":"application/json",...(options.headers||{})}});
 const type=res.headers.get("content-type")||"";
 const data=type.includes("application/json")?await res.json():await res.text();
 if(!res.ok) throw new Error(typeof data==="string"?data:(data.message||"Request failed"));
 return data;
}