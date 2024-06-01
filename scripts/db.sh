#!/bin/bash


#installation de netcat pour tester que le contoneur cassandra est pret.

apt-get update && apt-get install -y netcat

echo "Waiting for Cassandra to start..."

#pinger sur le port 9042, jusqu'a avoir une reponse:
while ! nc -z cassandra 9042; do
    sleep 1
done
echo "Cassandra started"

# Execute CQL file(s)
echo "Executing CQL scripts..."
timeout 400 cqlsh -f /scripts/keyspace.cql cassandra

echo "CQL scripts executed successfully"
