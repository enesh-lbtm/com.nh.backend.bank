INSERT INTO public.users(
       name, middle_name, surname, birthday, login, password, pin, role)
VALUES ('user', 'user', 'user', '30-03-1988', 'user@user.com','1234', 6666, 'user');

INSERT INTO account(
        users_id, title, type, to_increase, description, debit, credit, balance)
VALUES ( 1,'yeee', 'debit', 'upwards', 'upwards', 50, 60,  110);


INSERT INTO address(
    country, town, street, building_number, floor)
VALUES ('Belarus','Misk', 'l.bedy 2b', '2', '11');

/*/
    @Column(name = "country")
    private String country;

    @Column(name = "town")
    private String town;

    @Column(name = "street")
    private String street;

    @Column(name = "building_number")
    private Long buildingNumber;

    @Column(name = "floor")
    private Long floor;

 */