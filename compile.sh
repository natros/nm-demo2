#!/usr/bin/env bash

gradle --console=verbose clean :classes :testClasses
while [ 1 ]; do
  git checkout .
  gradle --console=verbose :classes :testClasses
  gsed 's/conf/foo/g' -i src/main/java/com/example/AuthenticatorFactory.java
  gsed 's/ApiConfiguration conf, Authenticator auth/Authenticator auth, @io.micronaut.core.annotation.Nullable ApiConfiguration conf/' -i src/main/java/com/example/ApiFactory.java
  gradle --console=verbose :classes :testClasses
  gsed 's/foo.getUsername(), foo.getPassword()/"foo.getUsername()", "foo.getPassword()"/g' -i src/main/java/com/example/AuthenticatorFactory.java
  gradle --console=verbose :classes :testClasses
  sleep 1
done
