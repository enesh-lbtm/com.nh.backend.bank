INSERT INTO public.users(
       name, middle_name, surname, birthday, login, password, pin, role)
VALUES ('user', 'user', 'user', '30-03-1988', 'user@user.com','1234', 6666, 'user');

INSERT INTO account(
        users_id, title, type, to_increase, description, debit, credit, balance)
VALUES ( 1,'yeee', 'debit', 'upwards', 'upwards', 50, 60,  110);


INSERT INTO address(
    country, town, street, buildingNumber, floor)
VALUES ('Turkmenistan','Kerki', 'B-aly', 3, 20);

INSERT INTO contract(
    usersId, type, constantly, currency, startDate, endDate, amount, interest, notes
)
VALUES(2, 'debet', 'yes', 'USD', '25.08.2018','30.06.2022', 3000,5000, 'null');

INSERT INTO transaction(
    accountId, clientId, type, tranDate, debit, amount
)
VALUES(11, 2,'kredit','23.06.2000', false, 0);

INSERT INTO usersContract(
    telMob, telHome, email
)
VALUES ("+375339110124","80044421162","eburyeva@gmail.com");


INSERT INTO usersdocument(
    nationality, birthPlace, livingCountry,type,documentNumber, documentSerial, issuedBy, issueDate, identNumber,familyStatus
)
VALUES('turkmen', 'kerki', 'Minsk', 'famele', '100092A', '112334','mvd Turkmenistan', '17.08.2016', '1230','unmarrid');

INSERT INTO usersstatus( disability, retiree, monthlyIncome)
VALUES('not','not', 250);

