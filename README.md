# VulnerableProject1

This is a sample Java project that contains a known vulnerability for testing Autofuzz. 

## Vulnerability Details

The project includes FasterXML jackson-databind version 2.8, which is known to have a critical security vulnerability: CVE-2019-12384. This vulnerability allows for remote code execution when deserializing untrusted data.

## Purpose
The purpose of this project is to provide a controlled environment for testing and demonstrating the Autofuzz tool's capabilities in identifying and exploiting vulnerabilities in Java applications.

It is also used for unit testing of Autofuzz's ability to scan and analyze Java projects to extract relevant information for test generation.