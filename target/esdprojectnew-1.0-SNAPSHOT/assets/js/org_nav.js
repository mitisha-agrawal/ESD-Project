//let organization_list = document.getElementById("org_nav");

//window.onload = fetch_organization;
async function fetch_organization(divName) {

    let response = await fetch("api/placement/displayorganizations");

    let orgs = await response.json(); // read response body and parse as JSON
    console.log(orgs);
    var printdata="Hello";
    document.getElementById(divName).innerHTML= "<html><body>" + printdata + "</body>";
    //document.getElementById("org_nav").innerHTML = "Hello Dear Visitor!";



}




