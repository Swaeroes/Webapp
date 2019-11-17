#Webapp

Run the app in local it uses embeded tomcat server
1. http://localhost:8080/h2/ - Once you ran this app H2 Database can use used using this link
2. Controller has following API
    - http://localhost:8080/api/v1/save
        Input JSON:
        {
            "id":2001,
           "full_name":"Name",
           "father_name":"Father name",
           "school_studied":"swar school",
           "year_of_joining_swr":1999,
           "qualifation":"MCA",
           "workplace":"Oracle",
           "designation":"Engineer",
           "blood_group":"B+",
           "marital_status":"UnMarried"
        }
        

    - http://localhost:8080/api/v1/findAll
