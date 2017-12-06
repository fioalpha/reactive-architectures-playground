package br.ufs.demos.rxmvp.playground.trivia.infrastructure;

import static br.ufs.demos.rxmvp.playground.util.Checks.notNullNotEmpty;

/**
 * Created by bira on 6/28/17.
 */

public class PayloadValidator {

    boolean accept(NumbersTriviaPayload payload) {
        return notNullNotEmpty(payload.entrySet());
    }

}
