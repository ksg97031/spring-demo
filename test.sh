export MY_HOST="http://127.0.0.1:8080"
# https://httpie.io/
http GET $MY_HOST/abcd
http POST $MY_HOST/abcd
http PUT $MY_HOST/abcd
http DELETE $MY_HOST/abcd
http PATCH $MY_HOST/abcd
http $MY_HOST/bracket
http $MY_HOST/multiple
http $MY_HOST/multiple/
http $MY_HOST/urltemplate/123
http $MY_HOST/ant/ksg
http $MY_HOST/regex/97031
