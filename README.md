## Test Controller
### Requirements
Java 17

### Build & Run
```sh
$ ./gradlew bootRun
or
$ ./gradlew build
$ java -jar build/libs/demo-0.0.1-SNAPSHOT.jar
```

### Test
```sh
$ chmod +x test.sh
$ ./test.sh
```

### Output
```
./test.sh
HTTP/1.1 200
Connection: keep-alive
Content-Length: 11
Content-Type: text/plain;charset=UTF-8
Date: Wed, 26 Jul 2023 14:47:23 GMT
Keep-Alive: timeout=60

@GetMapping


HTTP/1.1 200
Connection: keep-alive
Content-Length: 12
Content-Type: text/plain;charset=UTF-8
Date: Wed, 26 Jul 2023 14:47:23 GMT
Keep-Alive: timeout=60

@PostMapping


HTTP/1.1 200
Connection: keep-alive
Content-Length: 11
Content-Type: text/plain;charset=UTF-8
Date: Wed, 26 Jul 2023 14:47:23 GMT
Keep-Alive: timeout=60

@PutMapping


HTTP/1.1 200
Connection: keep-alive
Content-Length: 14
Content-Type: text/plain;charset=UTF-8
Date: Wed, 26 Jul 2023 14:47:23 GMT
Keep-Alive: timeout=60

@DeleteMapping


HTTP/1.1 200
Connection: keep-alive
Content-Length: 13
Content-Type: text/plain;charset=UTF-8
Date: Wed, 26 Jul 2023 14:47:25 GMT
Keep-Alive: timeout=60

@PatchMapping


HTTP/1.1 200
Connection: keep-alive
Content-Length: 27
Content-Type: text/plain;charset=UTF-8
Date: Wed, 26 Jul 2023 14:47:25 GMT
Keep-Alive: timeout=60

@GetMapping({ "/bracket" })


HTTP/1.1 200
Connection: keep-alive
Content-Length: 46
Content-Type: text/plain;charset=UTF-8
Date: Wed, 26 Jul 2023 14:47:25 GMT
Keep-Alive: timeout=60

@GetMapping(value={"/multiple", "/multiple/"})


HTTP/1.1 200
Connection: keep-alive
Content-Length: 46
Content-Type: text/plain;charset=UTF-8
Date: Wed, 26 Jul 2023 14:47:25 GMT
Keep-Alive: timeout=60

@GetMapping(value={"/multiple", "/multiple/"})


HTTP/1.1 200
Connection: keep-alive
Content-Length: 35
Content-Type: text/plain;charset=UTF-8
Date: Wed, 26 Jul 2023 14:47:26 GMT
Keep-Alive: timeout=60

@GetMapping({"/abcd/{id}"}); id=123


HTTP/1.1 200
Connection: keep-alive
Content-Length: 43
Content-Type: text/plain;charset=UTF-8
Date: Wed, 26 Jul 2023 14:47:26 GMT
Keep-Alive: timeout=60

@GetMapping("/ant/{name:[a-z]+}"); name=ksg


HTTP/1.1 200
Connection: keep-alive
Content-Length: 53
Content-Type: text/plain;charset=UTF-8
Date: Wed, 26 Jul 2023 14:47:26 GMT
Keep-Alive: timeout=60

@GetMapping("/regex/{number:^[0-9]+$}"); number=97031
```
