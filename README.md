# note_taking
1. Get all notes
curl -X GET http://localhost:8080/api/notes

2. Get a specific note by ID (replace {id} with the actual note ID)
curl -X GET http://localhost:8080/api/notes/{id}
For example, to get note with ID 1:

curl -X GET http://localhost:8080/api/notes/1

3. Create a new note
curl -X POST -H "Content-Type: application/json" -d '{"title":"New Note","content":"This is a new note."}' http://localhost:8080/api/notes

4. Update a note by ID (replace {id} with the actual note ID)
curl -X PUT -H "Content-Type: application/json" -d '{"title":"Updated Title","content":"Updated content."}' http://localhost:8080/api/notes/{id}
For example, to update note with ID 1:

curl -X PUT -H "Content-Type: application/json" -d '{"title":"Updated Title","content":"Updated content."}' http://localhost:8080/api/notes/1

5. Delete a note by ID (replace {id} with the actual note ID)
curl -X DELETE http://localhost:8080/api/notes/{id}
For example, to delete note with ID 1:

curl -X DELETE http://localhost:8080/api/notes/1
Explanation
-X specifies the HTTP method (GET, POST, PUT, DELETE, etc.).
-H adds a header to the request (e.g., specifying Content-Type).
-d sends data in the request body (used with -X POST or -X PUT).
http://localhost:8080/api/notes is the endpoint URL of your API.