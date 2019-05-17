package com.shuhler.graphqlhack;

import org.json.JSONException;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.skyscreamer.jsonassert.JSONAssert;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = GraphqlhackApplication.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class QueryIT {

    @LocalServerPort
    private int port;

    private TestRestTemplate restTemplate = new TestRestTemplate();

    private HttpHeaders headers = new HttpHeaders();

    @Test
    public void testQuery() throws JSONException {

        HttpEntity<String> entity = new HttpEntity<>(getTestBody(), headers);

        ResponseEntity<String> response = restTemplate.exchange(getFullUrl("/graphql"),
            HttpMethod.POST, entity, String.class);

        String expected = "{\"data\":{\"findAllBooks\":[{\"title\":\"The Grapes of Wrath\"},{\"title\":\"The Sun Also Rises\"}]}}";

        JSONAssert.assertEquals(expected, response.getBody(), false);
    }

    private String getFullUrl(String uri) {
        return "http://localhost:" + port + uri;
    }


    private String getTestBody() {

        return "{\n"
            + "    \"query\" : \"query {findAllBooks { title } }\"\n"
            + "}";
    }


}
