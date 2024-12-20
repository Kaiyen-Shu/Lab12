package com.example.api;

public class Data
{
    Result result;

    static class Result
    {
        Results[] results;

        static class Results
        {
            String Station;
            String Destination;
        }
    }
}
