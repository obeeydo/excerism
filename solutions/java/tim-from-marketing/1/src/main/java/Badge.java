class Badge {
    public String print(Integer id, String name, String department) {

        Badge badge = new Badge();
        badge.print(734, "Ernest Johnny Payne", "Strategic Communication");

        if (id == null){
            return badge.print(null, "Ernest Johnny Payne", "Strategic Communication");
        }


        return name;
    }

}
